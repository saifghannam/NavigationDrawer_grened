package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TableLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.viewpager.widget.ViewPager
import com.example.listview.Adapter.MyAdapter
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout

class MainActivity2 : AppCompatActivity() {
   private lateinit var pager: ViewPager
    private lateinit var tabLayout: TabLayout
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var drawerLayout:DrawerLayout=findViewById(R.id.drawer_id)
        var navView:NavigationView=findViewById(R.id.nav_id)
        pager=findViewById(R.id.viewpager)
        tabLayout=findViewById(R.id.tableLayoutId)

        tabLayout.addTab(tabLayout.newTab().setText("Home"))
        tabLayout.addTab(tabLayout.newTab().setText("profile"))
        tabLayout.addTab(tabLayout.newTab().setText("Setting"))
        tabLayout.tabGravity=TabLayout.GRAVITY_FILL
        var adapter=MyAdapter(this,supportFragmentManager,tabLayout.tabCount)

        pager.adapter=adapter
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
               pager.currentItem=tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }


        })

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