package ui.entertainer

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.ebookfrenzy.duvproject.R
import com.ebookfrenzy.duvproject.databinding.EntertainerDashboardActivityBinding
import com.google.android.material.navigation.NavigationView

class EntertainerDashboardActivity : AppCompatActivity() {
    // declare my variables for the views and also for binding
    private lateinit var binding: EntertainerDashboardActivityBinding
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EntertainerDashboardActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // initialize the views
        drawerLayout = binding.entertainerDashboardDrawerLayout
        navView = binding.entertainerDashboardNavViewLayout

        // set the toggle view as the navigation drawer also
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            it.isChecked = true
            when (it.itemId) {
                R.id.nav_dashboard -> Toast.makeText(applicationContext, "Clicked Dashboard", Toast.LENGTH_SHORT).show()
                R.id.nav_edit_profile -> replaceFragmentLayout(EntertainerProfileFragment(), it.title.toString())
                R.id.nav_bank_account_details -> Toast.makeText(applicationContext, "CLicked Bank Details", Toast.LENGTH_SHORT).show()
                R.id.nav_emergency_contact -> replaceFragmentLayout(EmergencyContactFragment(), it.title.toString())
                R.id.nav_youtube_channel -> Toast.makeText(applicationContext, "Clicked Youtube Channel", Toast.LENGTH_SHORT).show()
                R.id.nav_valid_identification -> Toast.makeText(applicationContext, "Clicked ID", Toast.LENGTH_SHORT).show()
                R.id.nav_switch_user -> Toast.makeText(applicationContext, "Clicked Switch User", Toast.LENGTH_SHORT).show()
                R.id.nav_logout -> Toast.makeText(applicationContext, "Logout", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    // write a function that would replace the frameLayout with the fragment
    private fun replaceFragmentLayout(fragment: Fragment, title: String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransactions = fragmentManager.beginTransaction()
        fragmentTransactions.replace(R.id.entertainer_dashboard_frame_layout, fragment)
        fragmentTransactions.commit()
        drawerLayout.closeDrawers()
        setTitle(title)
    }

    // override onOptionsItemSelected
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item))
            return true
        return super.onOptionsItemSelected(item)
    }
}
