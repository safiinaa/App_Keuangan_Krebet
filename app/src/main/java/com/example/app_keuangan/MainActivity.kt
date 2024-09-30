package com.example.app_keuangan

import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Setup Bottom Navigation
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    // Handle "Beranda" action
                    true
                }
                R.id.navigation_income -> {
                    // Handle "Pemasukan" action
                    true
                }
                R.id.navigation_expenses -> {
                    // Handle "Pengeluaran" action
                    true
                }
                R.id.navigation_report -> {
                    // Handle "Laporan" action
                    true
                }
                else -> false
            }
        }

        // Floating Action Button Action
        fab_add_transaction.setOnClickListener {
            // Handle Add Transaction button click
        }
    }

        }

    }