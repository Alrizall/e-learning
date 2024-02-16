// Generated by Dagger (https://dagger.dev).
package com.example.home;

import com.example.core.local.PreferenceHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<PreferenceHelper> preferenceHelperProvider;

  public HomeViewModel_Factory(Provider<PreferenceHelper> preferenceHelperProvider) {
    this.preferenceHelperProvider = preferenceHelperProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(preferenceHelperProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<PreferenceHelper> preferenceHelperProvider) {
    return new HomeViewModel_Factory(preferenceHelperProvider);
  }

  public static HomeViewModel newInstance(PreferenceHelper preferenceHelper) {
    return new HomeViewModel(preferenceHelper);
  }
}
