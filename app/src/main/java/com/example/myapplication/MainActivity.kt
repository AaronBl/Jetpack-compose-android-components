package com.example.myapplication

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.ExperimentalMaterialApi
import com.example.myapplication.material.bottomnav.BottomNavWithLabelsDemo
import com.example.myapplication.state.livedata.data.UserDataSource
import com.example.myapplication.state.livedata.domain.RepoImpl
import com.example.myapplication.state.livedata.presentation.UserViewModel
import com.example.myapplication.state.livedata.presentation.UserViewModelFactory


/**
 * [EN]
 * How to run the samples:
 * Just call the Composable methods of the packages inside setContent
 * Example: setContent { Toolbar() } ---> this will trigger the Toolbar() composable
 * inside the toolbar package where this UI code resides
 */

/**
 * [ES]
 * Como correr ejemplos:
 * Solo llama a la funcion composable de cualquiera de los paquetes del proyecto
 * Ejemplo: setContent { Toolbar() } ---> esto va a lanzar el composable del Toolbar()
 */

class MainActivity : AppCompatActivity() {

    // [ES] Viewmodel para proveer a UserScreen demo
    private val userViewModel by viewModels<UserViewModel> { UserViewModelFactory(
        RepoImpl(
        UserDataSource()
    )
    ) }

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // [ES] Llama aqui que es lo que quieres probar
            BottomNavWithLabelsDemo()
        }
    }
}














