package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var drawerLayout:DrawerLayout=findViewById(R.id.drawer_id)
        var navView:NavigationView=findViewById(R.id.nav_id)

        toggle= ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener {
            when(it.itemId){

                R.id.nav_home->{

                    Toast.makeText(this,"Clicked Home",Toast.LENGTH_SHORT).show()
                }
                R.id.nav_share->{

                Toast.makeText(this,"Clicked share",Toast.LENGTH_SHORT).show()
            }
                R.id.nav_message->{

                Toast.makeText(this,"Clicked message",Toast.LENGTH_SHORT).show()
            }

            }
            true

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true

        }
        return super.onOptionsItemSelected(item)

    }
}