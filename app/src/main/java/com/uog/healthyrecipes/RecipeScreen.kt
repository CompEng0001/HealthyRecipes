package com.uog.healthyrecipes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uog.healthyrecipes.data.*
import com.uog.healthyrecipes.ui.theme.HealthyRecipesTheme

@Composable
fun RecipeScreen(recipe: Recipe){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)) {
        Image(
            painter = painterResource(id = recipe.imageResId),
            contentDescription = recipe.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(15.dp))
        )
        Spacer(modifier = Modifier.height(20.dp))
        
        Text(text = recipe.title, style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = recipe.description, style = MaterialTheme.typography.bodySmall)

        Spacer(modifier = Modifier.height(10.dp))

        recipe.ingredients.forEach { ingredient ->
            Text(text = "- $ingredient", style = MaterialTheme.typography.bodySmall)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreivewRecipeScreen(){
    HealthyRecipesTheme {
        RecipeScreen(recipe = RecipeData.recipes[0])
    }
}