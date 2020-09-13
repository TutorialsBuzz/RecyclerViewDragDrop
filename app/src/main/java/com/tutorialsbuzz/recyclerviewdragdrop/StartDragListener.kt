package com.tutorialsbuzz.recyclerviewdragdrop

import androidx.recyclerview.widget.RecyclerView


interface StartDragListener {
    fun requestDrag(viewHolder: RecyclerView.ViewHolder?)
}