package com.example.armaghansabz.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.example.armaghansabz.screen.*
import com.example.armaghansabz.ui.theme.ArmaghanSabzTheme
import com.example.armaghansabz.viewmodel.LoginViewModel
import com.example.armaghansabz.viewmodel.RegisterViewModel
import com.example.data.db.AppDatabase
import com.example.data.entity.titleData
import com.example.data.utile.uidata
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArmaghanSabz()
        }
        val db = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "mydb"
        ).build()

        GlobalScope.launch(Dispatchers.IO) {
            val list = mutableListOf<titleData>()
            uidata.uiData.forEach {
                list.add(titleData(it.id,it.id,it.title))
            }
            db.listDao().insertAll(list)
            Log.d("TAG", "onCreate: ${db.listDao().getTitleData(1)}")
        }

    }

}

@Composable
fun ArmaghanSabz() {
    ArmaghanSabzTheme {
        val navController = rememberNavController()
        NavHost(navController, startDestination = "login") {

            composable(route = "login") {
                val loginViewModel = hiltViewModel<LoginViewModel>()
                Login(navController, loginViewModel)
            }

            composable(route = "otp") { Otp(navController) }
            composable(route = "verify") { Verify(navController) }
            composable(route = "register_pass") { Register_pass(navController) }

            composable(route = "register") {
                val registerViewModel = hiltViewModel<RegisterViewModel>()
                Register(navController, registerViewModel)
            }

            composable(route = "home") { Home(navController) }
            composable(route = "profile") {
                Profile(navController)



                composable(route = "archive") { Archive(navController) }
                composable(route = "global_archive") { GlobalArchive(navController) }
                composable(route = "local_archive") { LocalArchive(navController) }
                composable(route = "global_checklist_archive") {
                    GlobalChecklistArchive(
                        navController
                    )
                }
                composable(route = "global_Report_archive") { GlobalReportArchive(navController) }
                composable(route = "local_checklist_archive") { LocalChecklistArchive(navController) }
                composable(route = "local_report_archive") { LocalReportArchive(navController) }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    ArmaghanSabzTheme {
        ArmaghanSabz()
    }

}