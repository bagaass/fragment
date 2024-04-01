package com.example.myfriends_fragment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.myfriends_fragment.ui.theme.MyFriendsAddFragment
import com.example.myfriends_fragment.ui.theme.MyFriendsFragment
import com.example.myfriends_fragment.ui.theme.MyfriendsfragmentTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tampilMyFriendsFragment()
    }

    private fun gantiFragment(
        fragmentManager: FragmentManager,
        fragment: Fragment, frameId: Int
    ) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(frameId, fragment)
        transaction.commit()
    }

    fun tampilMyFriendsFragment() {
        gantiFragment(supportFragmentManager,
            MyFriendsFragment.newInstance(), R.id.contentFrame)
    }

    fun tampilMyFriendsAddFragment(){
        gantiFragment(supportFragmentManager,
            MyFriendsAddFragment.newInstance(), R.id.contentFrame)
    }
}