// Generated by view binder compiler. Do not edit!
package com.softsquared.template.kotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.softsquared.template.kotlin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView btnAlarm;

  @NonNull
  public final ImageView btnCategory;

  @NonNull
  public final Button btnDongne;

  @NonNull
  public final ImageView btnSearch;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final RecyclerView rvHome;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView btnAlarm,
      @NonNull ImageView btnCategory, @NonNull Button btnDongne, @NonNull ImageView btnSearch,
      @NonNull ImageView imageView5, @NonNull RecyclerView rvHome) {
    this.rootView = rootView;
    this.btnAlarm = btnAlarm;
    this.btnCategory = btnCategory;
    this.btnDongne = btnDongne;
    this.btnSearch = btnSearch;
    this.imageView5 = imageView5;
    this.rvHome = rvHome;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_alarm;
      ImageView btnAlarm = ViewBindings.findChildViewById(rootView, id);
      if (btnAlarm == null) {
        break missingId;
      }

      id = R.id.btn_category;
      ImageView btnCategory = ViewBindings.findChildViewById(rootView, id);
      if (btnCategory == null) {
        break missingId;
      }

      id = R.id.btn_dongne;
      Button btnDongne = ViewBindings.findChildViewById(rootView, id);
      if (btnDongne == null) {
        break missingId;
      }

      id = R.id.btn_search;
      ImageView btnSearch = ViewBindings.findChildViewById(rootView, id);
      if (btnSearch == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.rv_home;
      RecyclerView rvHome = ViewBindings.findChildViewById(rootView, id);
      if (rvHome == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, btnAlarm, btnCategory, btnDongne,
          btnSearch, imageView5, rvHome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}