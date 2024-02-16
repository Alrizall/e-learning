package com.example.quiz;

import androidx.lifecycle.ViewModel;
import com.example.core.NilaiInformation;
import com.example.core.QuizInformation;
import com.example.core.local.PreferenceHelper;
import com.example.core.util.KeyConstant;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.lang.reflect.Type;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/quiz/QuizViewModel;", "Landroidx/lifecycle/ViewModel;", "preferenceHelper", "Lcom/example/core/local/PreferenceHelper;", "(Lcom/example/core/local/PreferenceHelper;)V", "getQuestion", "Lcom/example/core/QuizInformation;", "id", "", "provideQuiz", "", "saveNilai", "", "nilai", "quiz_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class QuizViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.core.local.PreferenceHelper preferenceHelper = null;
    
    @javax.inject.Inject
    public QuizViewModel(@org.jetbrains.annotations.NotNull
    com.example.core.local.PreferenceHelper preferenceHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.core.QuizInformation> provideQuiz() {
        return null;
    }
    
    public final void saveNilai(int nilai) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.core.QuizInformation getQuestion(int id) {
        return null;
    }
}