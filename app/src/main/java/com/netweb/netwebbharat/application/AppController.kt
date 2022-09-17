package com.netweb.netwebbharat.application

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.netweb.netwebbharat.repo.Repository
import com.netweb.netwebbharat.ui.dashboard.DashboardViewModel

class AppController : Application(), Application.ActivityLifecycleCallbacks {
    lateinit var repository: Repository
    lateinit var dashboardViewModel: DashboardViewModel


    override fun onCreate() {
        super.onCreate()
        initialize()
        registerActivityLifecycleCallbacks(this)
    }

    private fun initialize() {
        repository = Repository()
        dashboardViewModel = DashboardViewModel(repository)
    }


    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
    }

    override fun onActivityStarted(activity: Activity) {
    }

    override fun onActivityResumed(activity: Activity) {
    }

    override fun onActivityPaused(activity: Activity) {
    }

    override fun onActivityStopped(activity: Activity) {
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
    }

    override fun onActivityDestroyed(activity: Activity) {
    }
}