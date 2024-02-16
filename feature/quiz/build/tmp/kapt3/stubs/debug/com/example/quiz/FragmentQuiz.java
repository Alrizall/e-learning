package com.example.quiz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDeepLinkRequest;
import com.example.core.QuizInformation;
import com.example.quiz.databinding.FragmentQuizBinding;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J \u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016J\u001a\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006("}, d2 = {"Lcom/example/quiz/FragmentQuiz;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/quiz/databinding/FragmentQuizBinding;", "binding", "getBinding", "()Lcom/example/quiz/databinding/FragmentQuizBinding;", "correctAnswer", "", "currentQuestion", "Lcom/example/core/QuizInformation;", "questionIndex", "userAnswer", "", "viewModel", "Lcom/example/quiz/QuizViewModel;", "getViewModel", "()Lcom/example/quiz/QuizViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initQuestion", "", "initRadioButton", "initView", "initVisibility", "state", "", "numQuestions", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "quiz_debug"})
public final class FragmentQuiz extends androidx.fragment.app.Fragment {
    private int correctAnswer = 0;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private com.example.quiz.databinding.FragmentQuizBinding _binding;
    @org.jetbrains.annotations.Nullable
    private java.lang.String userAnswer;
    private int questionIndex = 0;
    private com.example.core.QuizInformation currentQuestion;
    
    public FragmentQuiz() {
        super();
    }
    
    private final com.example.quiz.QuizViewModel getViewModel() {
        return null;
    }
    
    private final com.example.quiz.databinding.FragmentQuizBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initQuestion(int questionIndex) {
    }
    
    private final void initView() {
    }
    
    private final void initVisibility(boolean state, int questionIndex, int numQuestions) {
    }
    
    private final void initRadioButton() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}