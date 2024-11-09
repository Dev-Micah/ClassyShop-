package com.MicahNyabuto.shopper

import android.app.Application
import com.MicahNyabuto.shopper.di.presentationModule
import com.micahnyabuto.data.di.dataModule
import com.micahnyabuto.domain.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class ShopperApp:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ShopperApp)
            modules(listOf(
                presentationModule,
                domainModule,
                dataModule
            ))
        }
    }

}