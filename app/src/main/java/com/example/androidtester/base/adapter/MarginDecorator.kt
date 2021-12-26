package com.example.androidtester.base.adapter

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MarginDecorator(
    private val left: Int = 0,
    private val right: Int = 0,
    private val top: Int = 0,
    private val bottom: Int = 0,
) : RecyclerView.ItemDecoration() {

    constructor(all: Int) : this(
        left = all,
        right = all,
        top = all,
        bottom = all
    )

    constructor(horizontal: Int = 0, vertical: Int = 0) : this(
        left = horizontal,
        right = horizontal,
        top = vertical,
        bottom = vertical
    )

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State,
    ) {
        with(outRect) {
            left = this@MarginDecorator.left
            right = this@MarginDecorator.right
            top = this@MarginDecorator.top
            bottom = this@MarginDecorator.bottom
        }
    }
}