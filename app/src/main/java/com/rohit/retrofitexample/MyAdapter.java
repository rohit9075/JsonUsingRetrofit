package com.rohit.retrofitexample;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<Employee.Employees> employeesList;
    private Context mCtx;

    public MyAdapter(List<Employee.Employees> employees, Context context) {
        this.employeesList = employees;
        this.mCtx = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sample, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Employee.Employees employees = employeesList.get(position);
        holder.empId.setText(Integer.toString(employees.getId()));/* Convert Integer values to String */
        holder.empMobile.setText(employees.getMobileNo());
        holder.empPassword.setText(employees.getPassword());
    }

    @Override
    public int getItemCount() {
        return employeesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView empId, empMobile, empPassword;
        public CardView mCardView;

        public MyViewHolder(View view) {
            super(view);
            empId = (TextView) view.findViewById(R.id.empId);
            empMobile = (TextView) view.findViewById(R.id.empmobile);
            empPassword = (TextView) view.findViewById(R.id.empPassword);
            mCardView = (CardView) view.findViewById(R.id.user_cardView);
        }
    }
}
