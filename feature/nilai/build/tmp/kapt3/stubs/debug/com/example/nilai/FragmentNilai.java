package com.example.nilai;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDeepLinkRequest;
import com.example.core.NilaiInformation;
import com.example.nilai.adapter.NilaiAdapter;
import com.example.nilai.databinding.FragmentNilaiBinding;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\u001a\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006$"}, d2 = {"Lcom/example/nilai/FragmentNilai;", "Landroidx/fragment/app/Fragment;", "Lcom/example/nilai/adapter/NilaiAdapter$NilaiAdapterListener;", "()V", "_binding", "Lcom/example/nilai/databinding/FragmentNilaiBinding;", "binding", "getBinding", "()Lcom/example/nilai/databinding/FragmentNilaiBinding;", "nilaiAdapter", "Lcom/example/nilai/adapter/NilaiAdapter;", "getNilaiAdapter", "()Lcom/example/nilai/adapter/NilaiAdapter;", "nilaiAdapter$delegate", "Lkotlin/Lazy;", "nilaiViewModel", "Lcom/example/nilai/NilaiViewModel;", "getNilaiViewModel", "()Lcom/example/nilai/NilaiViewModel;", "nilaiViewModel$delegate", "initView", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "onclick", "data", "Lcom/example/core/NilaiInformation;", "nilai_debug"})
public final class FragmentNilai extends androidx.fragment.app.Fragment implements com.example.nilai.adapter.NilaiAdapter.NilaiAdapterListener {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy nilaiViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private com.example.nilai.databinding.FragmentNilaiBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy nilaiAdapter$delegate = null;
    
    public FragmentNilai() {
        super();
    }
    
    private final com.example.nilai.NilaiViewModel getNilaiViewModel() {
        return null;
    }
    
    private final com.example.nilai.databinding.FragmentNilaiBinding getBinding() {
        return null;
    }
    
    private final com.example.nilai.adapter.NilaiAdapter getNilaiAdapter() {
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
    
    private final void initView() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onclick(@org.jetbrains.annotations.NotNull
    com.example.core.NilaiInformation data) {
    }
}