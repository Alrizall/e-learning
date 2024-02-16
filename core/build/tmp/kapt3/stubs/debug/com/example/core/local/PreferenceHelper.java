package com.example.core.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H&\u00a8\u0006\n"}, d2 = {"Lcom/example/core/local/PreferenceHelper;", "", "deleteAllSharedPrefrence", "", "deleteSharedPreference", "key", "", "getStringInSharedPreference", "saveStringInSharedPreference", "value", "core_debug"})
public abstract interface PreferenceHelper {
    
    public abstract void saveStringInSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getStringInSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String key);
    
    public abstract void deleteSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String key);
    
    public abstract void deleteAllSharedPrefrence();
}