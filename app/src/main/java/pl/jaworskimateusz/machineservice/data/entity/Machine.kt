package pl.jaworskimateusz.machineservice.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "machines")
data class Machine(
        @PrimaryKey
        val machineId: Long,
        val code: String,
        val name: String,
        val description: String,
        @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
        val image: ByteArray?,
        @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
        val service_instruction: ByteArray?
)