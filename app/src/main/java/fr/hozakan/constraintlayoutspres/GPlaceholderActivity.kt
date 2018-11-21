package fr.hozakan.constraintlayoutspres

import android.os.Bundle
import android.support.constraint.Placeholder
import android.support.v7.app.AppCompatActivity
import android.transition.TransitionManager
import android.view.ViewGroup
import android.widget.Button

class GPlaceholderActivity : AppCompatActivity() {

    private val rootContent: ViewGroup by lazy { findViewById<ViewGroup>(R.id.rootContent) }
    private val button: Button by lazy { findViewById<Button>(R.id.moveContentButton) }
    private val button2: Button by lazy { findViewById<Button>(R.id.moveSecondButton) }
    private val placeholder: Placeholder by lazy { findViewById<Placeholder>(R.id.myPlaceholder) }
    private val placeholder2: Placeholder by lazy { findViewById<Placeholder>(R.id.mySecondPlaceholder) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.g_placeholders_layout)

        button.setOnClickListener {
            placeholder.setContentId(R.id.movedTv)
        }
        button2.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootContent)
            placeholder2.setContentId(R.id.movedAgainTv)
        }

    }

}