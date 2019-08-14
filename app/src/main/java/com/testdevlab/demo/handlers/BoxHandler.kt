package com.testdevlab.demo.handlers

import com.testdevlab.demo.BoxListener
import com.testdevlab.demo.models.Chocolate

class BoxHandler(val listener: BoxListener) {
    private val box = ArrayList<Chocolate>()

    //By default all is public
    /**
     * adds a chocolate to the box
     *
     * @param chocolate - the chocolate that will be added to the box
     */
    fun addChocolate(chocolate: Chocolate) {
        box.add(chocolate)
        listener.onBoxSizeChanged(box.size)
    }

    /**
     * Removes a chocolate to the box
     */
    fun removeChocolate() {
        if (box.size > 0 ) {
            box.removeAt(box.size - 1)
            listener.onBoxSizeChanged(box.size)
        }
    }
}