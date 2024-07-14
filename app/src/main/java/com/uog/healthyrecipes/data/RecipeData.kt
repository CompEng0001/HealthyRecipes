package com.uog.healthyrecipes.data

import com.uog.healthyrecipes.R

object RecipeData {

    val recipes  = listOf(
        Recipe(
            1,
            "Spaghetti Carbonara",
            "A classic Italian pasta dish made with eggs, cheese, pancetta, and pepper."+
                    " It’s creamy and delicious!",
            listOf(
                "200g spaghetti",
                "100g pancetta",
                "2 large eggs",
                "50g pecorino cheese",
                "50g parmesan",
                "2 cloves of garlic",
                "Black pepper",
                "Salt"),
            R.mipmap.spaghetti_carbonara ),

        Recipe(
            2,
            "Chicken Tikka Masala",
            "A popular Indian dish with grilled chunks of chicken enveloped in a creamy,"+
                    " spicy tomato sauce.",
            listOf("4 chicken breasts",
                "1 cup yogurt",
                "2 tbsp lemon juice",
                "2 tsp ground cumin",
                "2 tsp ground coriander",
                "1 tsp turmeric",
                "1 tsp paprika",
                "1 tsp chili powder",
                "2 tbsp vegetable oil",
                "1 onion",
                "2 cloves of garlic",
                "1 tsp ginger",
                "1 can of tomatoes",
                "1 cup cream",
                "Fresh coriander"),
            R.mipmap.chicken_tikka_masala),

        Recipe(
            3,
            "Avocado Toast",
            "A simple and healthy breakfast option with mashed avocado spread on toasted"+
                    " bread, often topped with various ingredients.",
            listOf(
                "2 slices of bread",
                "1 ripe avocado",
                "Salt", "Pepper",
                "Lemon juice",
                "Chili flakes (optional)",
                "Cherry tomatoes (optional)",
                "Feta cheese (optional)"),
            R.mipmap.avocado_toast
        )
    )
}