package com.example.demo

import org.springframework.lang.Nullable
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "cars")
class Car (
    @Id
    @Column(length = 16, unique = true, nullable = false)
    val id: UUID = UUID.randomUUID(),

    @Version
    val version: Long? = null,

    @Column(length = 50)
    @Nullable
    val make: String,

    @Column(length = 50)
    @Nullable
    var model: String?,

    @Nullable
    var year: Int?,

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    @Nullable
    var color: Color?,

    @Column(length = 2)
    @Nullable
    var tagState: String?,

    @Column(length = 10)
    @Nullable
    var tagNumber: String?

)  {

    override fun equals(other: Any?) = when {
        this === other -> true
        javaClass != other?.javaClass -> false
        id != (other as Car).id -> false
        else -> true
    }

    override fun hashCode(): Int = id.hashCode()
}


