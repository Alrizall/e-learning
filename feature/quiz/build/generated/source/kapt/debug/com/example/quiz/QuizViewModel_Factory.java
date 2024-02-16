// Generated by Dagger (https://dagger.dev).
package com.example.quiz;

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
public final class QuizViewModel_Factory implements Factory<QuizViewModel> {
  private final Provider<PreferenceHelper> preferenceHelperProvider;

  public QuizViewModel_Factory(Provider<PreferenceHelper> preferenceHelperProvider) {
    this.preferenceHelperProvider = preferenceHelperProvider;
  }

  @Override
  public QuizViewModel get() {
    return newInstance(preferenceHelperProvider.get());
  }

  public static QuizViewModel_Factory create(Provider<PreferenceHelper> preferenceHelperProvider) {
    return new QuizViewModel_Factory(preferenceHelperProvider);
  }

  public static QuizViewModel newInstance(PreferenceHelper preferenceHelper) {
    return new QuizViewModel(preferenceHelper);
  }
}