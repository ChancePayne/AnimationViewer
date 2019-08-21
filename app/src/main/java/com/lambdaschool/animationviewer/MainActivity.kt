package com.lambdaschool.animationviewer

import android.annotation.SuppressLint
import android.graphics.ImageDecoder
import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimatedImageDrawable
import android.graphics.drawable.AnimationDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongThread")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add and animate a gif
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            val gifDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(resources, R.drawable.walking_duck))
            animated_image.setImageDrawable(gifDrawable)
            (gifDrawable as AnimatedImageDrawable).start()
        }*/

        // use an animated drawable
        /*val frameDrawable = ContextCompat.getDrawable(this, R.drawable.toaster_animated)
        animated_image.setImageDrawable(frameDrawable)
        (frameDrawable as AnimationDrawable).start()*/

        // use animated vector drawable
        val animatedVectorDrawable = ContextCompat.getDrawable(this, R.drawable.avd_playtopause)
        animated_image.setImageDrawable(animatedVectorDrawable)
        (animatedVectorDrawable as Animatable).start()
    }
}
