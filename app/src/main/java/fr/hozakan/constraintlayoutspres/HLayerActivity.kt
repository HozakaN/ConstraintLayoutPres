package fr.hozakan.constraintlayoutspres

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.TransitionManager
import kotlinx.android.synthetic.main.h_layer_layout.*

class HLayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.h_layer_layout)

        moveContentButton.setOnClickListener {
            layer1.animate().translationY(150f).setDuration(1500).start()
        }

        moveSecondButton.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootContent)
            layer2.translationX = 150f
        }
    }
}