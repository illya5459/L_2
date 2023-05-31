package com.example.labka2.list

import android.icu.text.CaseMap.Title
import android.media.Image
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize data class ArticleModel(
    val image: String,
    val title: String,
    val ingredients: String,
    val price: String
) : Parcelable {
    companion object {

        fun createDefultData(): List<ArticleModel> {
            val list = ArrayList<ArticleModel>()
            list.add(ArticleModel("https://pizzaday.eatery.club/storage/pizzaday/product/icon/1344/26f343c40875959617a836ebad4cf0ff.jpg","Пепероні","Пепероні,сир Моцарелла,соус фірмовий томатний,спеції.","145 грн"))
            list.add(ArticleModel("https://pizzaday.eatery.club/storage/pizzaday/product/icon/6898/b4a72f5a432ed853a3abcd4c26c68975.jpg","БірБургер","Курка, сир Моцарелла, помідор, огірок солоний, маринована цибуля, соус фірмовий томатний, соус Бургер.","155 грн"))
            list.add(ArticleModel("https://pizzaday.eatery.club/storage/pizzaday/product/icon/3396/c8dda790af6d4b041a96ea782bf704f9.jpg","М'ясна","Шинка, салямі, бекон, сир Моцарелла, помідор, маринована цибуля, соус фірмовий томатний.","125 грн"))
            list.add(ArticleModel("https://pizzaday.eatery.club/storage/pizzaday/product/icon/3318/9d2b70a28bf4396008c63516c995527c.jpg","Сімейна","Шинка, сир Моцарелла, болгарський перець, маринована цибуля, соус фірмовий томатний.","140 грн"))
            list.add(ArticleModel("https://pizzaday.eatery.club/storage/pizzaday/product/icon/6885/2b24c5505a0d73805032d636ba308703.jpg","Франческа","Бекон, салямі, сир Моцарелла, помідор, печериці, маслини, соус фірмовий томатний.","160 грн"))
            return list
        }
    }
}
