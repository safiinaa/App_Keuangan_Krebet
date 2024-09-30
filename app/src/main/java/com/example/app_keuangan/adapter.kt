package com.example.app_keuangan

import android.view.LayoutInflater
import android.view.SurfaceControl
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class adapter {
    class TransactionAdapter(private val transactions: List<SurfaceControl.Transaction>) :
        RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_transaction, parent, false)
            return TransactionViewHolder(view)
        }

        override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
            val transaction = transactions[position]
            holder.bind(transaction)
        }

        override fun getItemCount(): Int = transactions.size

        class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(transaction: Transaction) {
                itemView.findViewById<TextView>(R.id.tv_transaction_name).text = transaction.name
                itemView.findViewById<TextView>(R.id.tv_transaction_amount).text = transaction.amount
            }
        }
    }

}