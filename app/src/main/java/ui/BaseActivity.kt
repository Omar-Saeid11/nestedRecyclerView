package ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {
    abstract val LOG_TAG: String
    abstract var bindingInflater: (LayoutInflater) -> VB
    private lateinit var binding: ViewBinding
    protected val bindingV
        get() = binding as VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = bindingInflater(layoutInflater)
        setContentView(binding.root)
        setUp()
        addCallBacks()
    }

    abstract fun addCallBacks()

    abstract fun setUp()


    fun log(value: Any) {
        Log.v(LOG_TAG, value.toString())
    }
}