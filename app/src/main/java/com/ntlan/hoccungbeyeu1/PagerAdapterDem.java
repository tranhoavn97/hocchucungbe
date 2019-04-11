package com.ntlan.hoccungbeyeu1;

import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class PagerAdapterDem extends FragmentStatePagerAdapter{


    PagerAdapterDem(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override

    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new dem1();

                break;
            case 1:
                frag = new dem2();
                break;
            case 2:
                frag = new dem3();
                break;
            case 3:
                frag= new dem4();
                break;
            case 4:
                frag= new dem5();
                break;
            case 5:
                frag= new dem6();
                break;
            case 6:
                frag= new dem7();
                break;
            case 7:
                frag= new dem8();
                break;
            case 8:
                frag= new dem9();
                break;
            case 9:
                frag= new dem10();
                break;
        }
        return frag;
    }
    @Override
    public int getCount() {
        return 10;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "1";
                break;
            case 1:
                title = "2";
                break;
            case 2:
                title = "3";
                break;
            case 3:
                title = "4";
                break;
            case 4:
                title = "5";
                break;
            case 5:
                title = "6";
                break;
            case 6:
                title = "7";
                break;
            case 7:
                title = "8";
                break;
            case 8:
                title = "9";
                break;
            case 9:
                title = "10";
                break;
        }
        return title;
    }

}
