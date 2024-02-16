package com.example.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDeepLinkRequest;
import com.bumptech.glide.Glide;
import com.example.core.DashboardInformation;
import com.example.core.DuedateInformation;
import com.example.home.adapter.DuedateAdapter;
import com.example.home.adapter.PemberitahuanAdapter;
import com.example.home.databinding.FragmentHomeBinding;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\u001a\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010\'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010\'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020*H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006+"}, d2 = {"Lcom/example/home/FragmentHome;", "Landroidx/fragment/app/Fragment;", "Lcom/example/home/adapter/PemberitahuanAdapter$PemberitahuanAdapterListener;", "Lcom/example/home/adapter/DuedateAdapter$DuedateAdapterListener;", "()V", "_binding", "Lcom/example/home/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/example/home/databinding/FragmentHomeBinding;", "duedateAdapter", "Lcom/example/home/adapter/DuedateAdapter;", "getDuedateAdapter", "()Lcom/example/home/adapter/DuedateAdapter;", "duedateAdapter$delegate", "Lkotlin/Lazy;", "homeViewModel", "Lcom/example/home/HomeViewModel;", "getHomeViewModel", "()Lcom/example/home/HomeViewModel;", "homeViewModel$delegate", "pemberitahuanAdapter", "Lcom/example/home/adapter/PemberitahuanAdapter;", "getPemberitahuanAdapter", "()Lcom/example/home/adapter/PemberitahuanAdapter;", "pemberitahuanAdapter$delegate", "initView", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "onclick", "data", "Lcom/example/core/DashboardInformation;", "Lcom/example/core/DuedateInformation;", "home_debug"})
public final class FragmentHome extends androidx.fragment.app.Fragment implements com.example.home.adapter.PemberitahuanAdapter.PemberitahuanAdapterListener, com.example.home.adapter.DuedateAdapter.DuedateAdapterListener {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy homeViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private com.example.home.databinding.FragmentHomeBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy pemberitahuanAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy duedateAdapter$delegate = null;
    
    public FragmentHome() {
        super();
    }
    
    private final com.example.home.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    private final com.example.home.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    private final com.example.home.adapter.PemberitahuanAdapter getPemberitahuanAdapter() {
        return null;
    }
    
    private final com.example.home.adapter.DuedateAdapter getDuedateAdapter() {
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
    com.example.core.DashboardInformation data) {
    }
    
    @java.lang.Override
    public void onclick(@org.jetbrains.annotations.NotNull
    com.example.core.DuedateInformation data) {
    }
}