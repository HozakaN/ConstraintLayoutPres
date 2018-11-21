package fr.hozakan.constraintlayoutspres

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import android.support.v7.app.AppCompatActivity
import android.transition.TransitionManager
import kotlinx.android.synthetic.main.j_state1_layout.*

class JConstraintSetActivity : AppCompatActivity() {

    private val constraintSet1 = ConstraintSet()
    private val constraintSet2 = ConstraintSet()
    private var state = false
    private lateinit var constraintLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.j_state1_layout)
        constraintLayout = findViewById(R.id.rootContent)
        constraintSet2.clone(this, R.layout.j_state2_layout)
        constraintSet1.clone(constraintLayout)

        myButton.setOnClickListener {
            TransitionManager.beginDelayedTransition(constraintLayout)
            val constraintSet = if (state) {
                constraintSet1
            } else {
                constraintSet2
            }
            state = !state

            constraintSet.applyTo(constraintLayout)
        }
    }
}