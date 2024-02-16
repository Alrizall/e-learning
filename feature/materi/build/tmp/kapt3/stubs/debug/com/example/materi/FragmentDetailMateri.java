package com.example.materi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import com.bumptech.glide.Glide;
import com.example.core.MateriInformation;
import com.example.materi.databinding.FragmentDetailMateriBinding;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\u001a\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0006\u0010&\u001a\u00020\u001aR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/example/materi/FragmentDetailMateri;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/materi/databinding/FragmentDetailMateriBinding;", "binding", "getBinding", "()Lcom/example/materi/databinding/FragmentDetailMateriBinding;", "idMateri", "Lcom/example/materi/FragmentDetailMateriArgs;", "getIdMateri", "()Lcom/example/materi/FragmentDetailMateriArgs;", "idMateri$delegate", "Landroidx/navigation/NavArgsLazy;", "imageUri", "Landroid/net/Uri;", "intentGalleryLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "materiViewModel", "Lcom/example/materi/MateriViewModel;", "getMateriViewModel", "()Lcom/example/materi/MateriViewModel;", "materiViewModel$delegate", "Lkotlin/Lazy;", "initView", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "openGalery", "materi_debug"})
public final class FragmentDetailMateri extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private android.net.Uri imageUri;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy materiViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private com.example.materi.databinding.FragmentDetailMateriBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavArgsLazy idMateri$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> intentGalleryLauncher = null;
    
    public FragmentDetailMateri() {
        super();
    }
    
    private final com.example.materi.MateriViewModel getMateriViewModel() {
        return null;
    }
    
    private final com.example.materi.databinding.FragmentDetailMateriBinding getBinding() {
        return null;
    }
    
    private final com.example.materi.FragmentDetailMateriArgs getIdMateri() {
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
    
    public final void openGalery() {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}