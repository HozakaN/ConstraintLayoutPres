package fr.hozakan.constraintlayoutspres

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.d_group_layout.*

class DGroupActivity :AppCompatActivity() {

    private val button: Button by lazy { findViewById<Button>(R.id.loginButton) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.d_group_layout)

        button.setOnClickListener {
            myGroup.visibility = View.GONE
        }
    }
}