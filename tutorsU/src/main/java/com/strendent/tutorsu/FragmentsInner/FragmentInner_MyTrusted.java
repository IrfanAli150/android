package com.strendent.tutorsu.FragmentsInner;

import com.strendent.tutorsu.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentInner_MyTrusted extends Fragment {

		private View mView;

		public FragmentInner_MyTrusted(){
			setRetainInstance(true);
		}


		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

			if(mView == null){
				mView = inflater.inflate(R.layout.fragment_demo, container, false);
				TextView textview=(TextView) mView.findViewById(R.id.name);
				textview.setText("My Trusted");

			}else{
				((ViewGroup) mView.getParent()).removeView(mView);
			}

			return mView;
		}
}
