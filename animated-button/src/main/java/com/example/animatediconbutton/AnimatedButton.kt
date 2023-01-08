package com.example.animatediconbutton

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class AnimatedButton(context: Context, attr: AttributeSet) : ConstraintLayout(context, attr) {
    private val attributes: TypedArray
    private val textView: TextView
    private val img: ImageView
    private val progressBar: ProgressBar


    init {
        inflate(context, R.layout.animated_button, this)
        textView = findViewById(R.id.text)
        img = findViewById(R.id.icon)
        progressBar = findViewById(R.id.prg)
        attributes = context.obtainStyledAttributes(attr, R.styleable.AnimatedButton)
        setText(attributes.getString(R.styleable.AnimatedButton_ab_text)!!)
        setIcon(
            attributes.getResourceId(
                R.styleable.AnimatedButton_ab_icon,
                R.drawable.ic_launcher_background
            )
        )
    }

    fun getText(): String? {
        return attributes.getString(R.styleable.AnimatedButton_ab_text)
    }

    @SuppressWarnings
    fun setText(text: String) {
        textView.text = text
        textView.textSize = attributes.getDimension(R.styleable.AnimatedButton_ab_textSize, 18F)
    }

    fun setIcon(resourceId: Int) {
        img.setImageResource(resourceId)
    }

    fun disableIcon() {
        img.visibility = View.GONE
    }

    fun activateButton() {
        textView.text = attributes.getString(R.styleable.AnimatedButton_ab_changeText)
        progressBar.visibility = View.VISIBLE
    }

    fun deactivateButton() {
        textView.text = attributes.getString(R.styleable.AnimatedButton_ab_text)
        progressBar.visibility = View.GONE
    }




}