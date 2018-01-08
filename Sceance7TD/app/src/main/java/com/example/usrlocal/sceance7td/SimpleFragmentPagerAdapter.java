package com.example.usrlocal.sceance7td;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by usrlocal on 08/01/2018.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

  private Context context;

  public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
    super(fm);
    this.context = context;
  }

  @Override
  public Fragment getItem(int position) {
    if(position == 0){
      return new Fragment();
    }else if(position == 1) {
      return new Fragment();
    }else {
      return null;
    }
  }

  @Override
  public int getCount() {
    return 3;
  }

  @Override
  public CharSequence getPageTitle(int position) {
    switch(position){
      case 0: return context.getString(R.string.category_jeu);
      case 1: return context.getString(R.string.category_options);
      default: return null;
    }
  }
}
