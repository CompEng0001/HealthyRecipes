package com.uog.healthyrecipes

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.uog.healthyrecipes.data.*
import com.uog.healthyrecipes.ui.theme.HealthyRecipesTheme


@Composable
fun RecipeListScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Choose a Recipe", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(20.dp))

        RecipeData.recipes.forEach { recipe ->
            RecipeItem(recipe = recipe, onClick = {
                navController.navigate(
                    "recipe_${recipe.id}"
                )
            })
        }
    }
}

@Composable
fun RecipeItem(recipe: Recipe, onClick: () -> Unit){
    Card(
         modifier = Modifier
             .fillMaxWidth()
             .clickable { onClick() }
             .padding(8.dp),
        shape = RoundedCornerShape(8.dp)
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ){
            Image(
                painter = painterResource(id = recipe.imageResId),
                contentDescription = recipe.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = recipe.title, style = MaterialTheme.typography.headlineSmall)
                Text(text = recipe.description, style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRecipeListScreen(){
    HealthyRecipesTheme {
        val navController = rememberNavController()
        RecipeListScreen(navController = navController)
    }
}