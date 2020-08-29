package com.rishabh.expensio

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        expensio_top_bar.setOnMenuItemClickListener{item: MenuItem? ->
            when(item?.itemId) {
                R.id.mode -> {
                    val currentIcon = item.icon
                    val sunDrawable: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.ic_mode_icon_sun, null)
                    val moonDrawable: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.ic_mode_icon_moon,  null)
                    val nextIcon: Drawable? = if (currentIcon.equals(sunDrawable)) moonDrawable else moonDrawable
                    Toast.makeText(applicationContext, "Color Mode changed", Toast.LENGTH_SHORT).show()
                    item.setIcon(nextIcon)
                    true
                }
                else -> false
            }
        }
    }


}
