package com.perol.asdpl.pixivez.objects

import com.perol.asdpl.pixivez.responses.Illust
import java.lang.ref.WeakReference
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.set

class DataHolder {
    companion object{
        private var illustsList: ArrayList<Illust>? = ArrayList<Illust>()

        fun getIllustsList(): ArrayList<Illust>? {
            return this.illustsList
        }

        fun setIllustsList(illustList: ArrayList<Illust>) {
            this.illustsList = illustList
        }
    }

    var data: MutableMap<String, WeakReference<Any>> =
        HashMap<String, WeakReference<Any>>()

    fun save(id: String, `object`: Any?) {
        data[id] = WeakReference<Any>(`object`)
    }

    fun retrieve(id: String): Any? {
        val objectWeakReference: WeakReference<Any>? = data[id]
        return objectWeakReference?.get()
    }
}