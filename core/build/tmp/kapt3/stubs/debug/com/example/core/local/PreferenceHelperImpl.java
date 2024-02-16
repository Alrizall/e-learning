package com.example.core.local;

import android.content.SharedPreferences;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/core/local/PreferenceHelperImpl;", "Lcom/example/core/local/PreferenceHelper;", "sharedPreferences", "Landroid/content/SharedPreferences;", "editor", "Landroid/content/SharedPreferences$Editor;", "(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$Editor;)V", "deleteAllSharedPrefrence", "", "deleteSharedPreference", "key", "", "getStringInSharedPreference", "saveStringInSharedPreference", "value", "core_debug"})
public final class PreferenceHelperImpl implements com.example.core.local.PreferenceHelper {
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences.Editor editor = null;
    
    @javax.inject.Inject
    public PreferenceHelperImpl(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull
    android.content.SharedPreferences.Editor editor) {
        super();
    }
    
    @java.lang.Override
    public void saveStringInSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getStringInSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return null;
    }
    
    @java.lang.Override
    public void deleteSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
    }
    
    @java.lang.Override
    public void deleteAllSharedPrefrence() {
    }
}