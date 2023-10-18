package edu.uw.ischool.avajjh.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate event fired");
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart event fired");
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume event fired");
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop event fired");
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause event fired");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "We're going down captain!");

    }
}