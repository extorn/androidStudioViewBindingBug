package com.delit.androidstudioviewbindingbug.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.delit.androidstudioviewbindingbug.BuildConfig
import com.delit.androidstudioviewbindingbug.databinding.SectionBinding

class Section(context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    init {
        val vBinding = SectionBinding.inflate(LayoutInflater.from(context), this, false)
        with(vBinding) {
            fields.field1.text = BuildConfig.APPLICATION_ID
        }
        addView(vBinding.root)
    }
}