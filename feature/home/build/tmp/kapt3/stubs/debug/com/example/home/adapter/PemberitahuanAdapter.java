package com.example.home.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.example.core.DashboardInformation;
import com.example.home.databinding.ItemPemberitahuanBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/home/adapter/PemberitahuanAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/core/DashboardInformation;", "Lcom/example/home/adapter/ItemPermberitahuanViewHolder;", "listener", "Lcom/example/home/adapter/PemberitahuanAdapter$PemberitahuanAdapterListener;", "(Lcom/example/home/adapter/PemberitahuanAdapter$PemberitahuanAdapterListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "PemberitahuanAdapterListener", "home_debug"})
public final class PemberitahuanAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.core.DashboardInformation, com.example.home.adapter.ItemPermberitahuanViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.example.home.adapter.PemberitahuanAdapter.PemberitahuanAdapterListener listener = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.core.DashboardInformation> adapterCallback = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.home.adapter.PemberitahuanAdapter.Companion Companion = null;
    
    public PemberitahuanAdapter(@org.jetbrains.annotations.NotNull
    com.example.home.adapter.PemberitahuanAdapter.PemberitahuanAdapterListener listener) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.home.adapter.ItemPermberitahuanViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.home.adapter.ItemPermberitahuanViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/home/adapter/PemberitahuanAdapter$Companion;", "", "()V", "adapterCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/core/DashboardInformation;", "getAdapterCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "home_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.core.DashboardInformation> getAdapterCallback() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/home/adapter/PemberitahuanAdapter$PemberitahuanAdapterListener;", "", "onclick", "", "data", "Lcom/example/core/DashboardInformation;", "home_debug"})
    public static abstract interface PemberitahuanAdapterListener {
        
        public abstract void onclick(@org.jetbrains.annotations.NotNull
        com.example.core.DashboardInformation data);
    }
}