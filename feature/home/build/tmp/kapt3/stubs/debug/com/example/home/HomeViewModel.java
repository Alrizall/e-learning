package com.example.home;

import androidx.lifecycle.ViewModel;
import com.example.core.DashboardInformation;
import com.example.core.DuedateInformation;
import com.example.core.local.PreferenceHelper;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "preferenceHelper", "Lcom/example/core/local/PreferenceHelper;", "(Lcom/example/core/local/PreferenceHelper;)V", "dashboardInformationProvider", "", "Lcom/example/core/DashboardInformation;", "duedateInformationProvider", "Lcom/example/core/DuedateInformation;", "getUserName", "", "home_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.core.local.PreferenceHelper preferenceHelper = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.example.core.local.PreferenceHelper preferenceHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.core.DashboardInformation> dashboardInformationProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.core.DuedateInformation> duedateInformationProvider() {
        return null;
    }
}