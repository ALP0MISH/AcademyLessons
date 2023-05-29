package com.example.academylessons.collerctions

import android.util.Log
import kotlin.math.log

class CollectionClassWork {
    init {

   //     exempleFirst()
        exempleThird()
   //     exempleSecond()


    }
//    private fun exempleFirst() {
//        //создание типа лист
//        val list = listOf<Short>()
//        //создание типа лист
//        val mutableList = mutableListOf<String>()
//
//        //обьект  лист мы в дальнейшем не можем изменять
//        // list add - отсуствует
//        //list.remove - отсуствует
//
//        // Обычное добавление
//        mutableList.add("Bob")
//
//        // выборочное добавление
//        mutableList.add(index = 0, element = "Bob")
//
//        // обычное удаление с помощю индекса
//        mutableList.removeAt(index = 0)
//
//
//        val secondMutableList = mutableListOf<String>()
//
//        secondMutableList.add("taxi")
//        secondMutableList.add("naruto")
//
//
//        mutableList.addAll(secondMutableList)
//        secondMutableList.add("passanger")
//
//        Log.i("abdurahman", mutableList.toString())
//        mutableList.clear()
//        Log.i("abdurahman", mutableList.toString())
//
//        //
//
//        for (i in mutableList) {
//
//        }
//
//
//        // способ пребирать обект с помощью forEach
//        mutableList.forEach { element ->
//        }
//
//    }
//
//    private  fun exempleSecond(){
//        val set = setOf<String>()
//        val mutableset = mutableListOf<String>()
//
//        mutableset.add("Bob")
//
//        mutableset.add("Bob")
//
//        Log.i("abdurahman", mutableset.toString())
//
//        mutableset.remove(element = "Bob")
//
//        mutableset.forEachIndexed { index, element ->






    private fun exempleThird(){
        val map = mapOf<String, Int>()
        val mutableMap = mutableMapOf<String,Int>()
        mutableMap.put(key ="1234", value = 9)

        val nine = mutableMap["1234"]
        Log.i("abdurahman", nine .toString())



    }

    private  fun exempleFour(){
        val hashSet = hashSetOf<String>()
        hashSet.add("dd")
        hashSet.add("dd")
        Log.i("abdurahman", hashSet .toString())
    }
} 