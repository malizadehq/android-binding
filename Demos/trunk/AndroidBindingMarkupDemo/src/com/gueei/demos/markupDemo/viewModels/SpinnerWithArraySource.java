package com.gueei.demos.markupDemo.viewModels;

import gueei.binding.Command;
import gueei.binding.Observable;
import gueei.binding.collections.ArrayListObservable;
import android.view.View;
import android.widget.Toast;

public class SpinnerWithArraySource {
	public final Observable<Object> Selected = new Observable<Object>(Object.class);
	public final ArrayListObservable<String> ContinentNames = 
		new ArrayListObservable<String>(String.class);
	public final Command ToastContinent = new Command(){
		public void Invoke(View view, Object... args) {
			Toast.makeText(view.getContext(), Selected.get().toString(), Toast.LENGTH_SHORT).show();
		}
	};
	
	public SpinnerWithArraySource(){
		ContinentNames.setArray(new String[]{
			"Asia", "Africa", "Antarctica", "Australia",
			"Europe", "North America", "South America"
		});
	}
}
