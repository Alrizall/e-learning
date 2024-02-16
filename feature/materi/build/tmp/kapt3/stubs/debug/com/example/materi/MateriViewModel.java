package com.example.materi;

import androidx.lifecycle.ViewModel;
import com.example.core.MateriInformation;
import com.example.core.local.PreferenceHelper;
import com.example.core.util.KeyConstant;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.lang.reflect.Type;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/materi/MateriViewModel;", "Landroidx/lifecycle/ViewModel;", "preferenceHelper", "Lcom/example/core/local/PreferenceHelper;", "(Lcom/example/core/local/PreferenceHelper;)V", "initQuestion", "", "isAdmin", "", "materiViewModelProvider", "Lcom/example/core/MateriInformation;", "id", "", "updateQuestion", "data", "materi_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MateriViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.core.local.PreferenceHelper preferenceHelper = null;
    
    @javax.inject.Inject
    public MateriViewModel(@org.jetbrains.annotations.NotNull
    com.example.core.local.PreferenceHelper preferenceHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.core.MateriInformation materiViewModelProvider(int id) {
        return null;
    }
    
    public final void initQuestion() {
    }
    
    public final void updateQuestion(@org.jetbrains.annotations.NotNull
    com.example.core.MateriInformation data) {
    }
    
    public final boolean isAdmin() {
        return false;
    }
}