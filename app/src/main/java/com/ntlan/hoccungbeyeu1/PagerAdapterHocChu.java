package com.ntlan.hoccungbeyeu1;

import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class PagerAdapterHocChu extends FragmentStatePagerAdapter{


    PagerAdapterHocChu(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override

    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new fragmentHocChu();

                break;
            case 1:
                frag = new a2();
                break;
            case 2:
                frag = new a3();
                break;
            case 3:
                frag= new b();
                break;
            case 4:
                frag= new c();
                break;
            case 5:
                frag= new d1();
                break;
            case 6:
                frag= new d2();
                break;
            case 7:
                frag= new e1();
                break;
            case 8:
                frag= new e2();
                break;
            case 9:
                frag= new g();
                break;
            case 10:
                frag= new h();
                break;
            case 11:
                frag= new i();
                break;
            case 12:
                frag= new k();
                break;
            case 13:
                frag= new l();
                break;
            case 14:
                frag= new m();
                break;
            case 15:
                frag= new n();
                break;
            case 16:
                frag= new o1();
                break;
            case 17:
                frag= new o2();
                break;
            case 18:
                frag= new o3();
                break;
            case 19:
                frag= new p();
                break;
            case 20:
                frag= new q();
                break;
            case 21:
                frag= new chuR();
                break;
            case 22:
                frag= new s();
                break;
            case 23:
                frag= new t();
                break;
            case 24:
                frag= new u();
                break;
            case 25:
                frag= new u2();
                break;
            case 26:
                frag= new v();
                break;
            case 27:
                frag= new x();
                break;
            case 28:
                frag= new y();
                break;




        }
        return frag;
    }
    @Override
    public int getCount() {
        return 29;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "A";
                break;
            case 1:
                title = "Ă";
                break;
            case 2:
                title = "Â";
                break;
            case 3:
                title = "B";
                break;
            case 4:
                title = "C";
                break;
            case 5:
                title = "D";
                break;
            case 6:
                title = "Đ";
                break;
            case 7:
                title = "E";
                break;
            case 8:
                title = "Ê";
                break;
            case 9:
                title = "G";
                break;
            case 10:
                title = "H";
                break;
            case 11:
                title = "I";
                break;
            case 12:
                title = "K";
                break;
            case 13:
                title = "L";
                break;
            case 14:
                title = "M";
                break;
            case 15:
                title = "N";
                break;
            case 16:
                title = "O";
                break;
            case 17:
                title = "Ô";
                break;
            case 18:
                title = "Ơ";
                break;
            case 19:
                title = "P";
                break;
            case 20:
                title = "Q";
                break;
            case 21:
                title = "R";
                break;
            case 22:
                title = "S";
                break;
            case 23:
                title = "T";
                break;
            case 24:
                title = "U";
                break;
            case 25:
                title = "Ư";
                break;
            case 26:
                title = "V";
                break;
            case 27:
                title = "X";
                break;
            case 28:
                title = "Y";
                break;
        }
        return title;
    }
}
