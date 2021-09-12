package nesty.anzhy.matkonim.data.database

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import nesty.anzhy.matkonim.ui.models.FoodRecipe

class RecipesTypeConverter {

    var gson = Gson()

    @TypeConverter
    fun foodRecipeToString(foodRecipe: FoodRecipe):String{
        return gson.toJson(foodRecipe)
    }

    @TypeConverter
    fun stringToFoodRecipe(data:String):FoodRecipe{
        val listType = object : TypeToken<FoodRecipe>() {}.type
        return gson.fromJson(data, listType)
    }
}