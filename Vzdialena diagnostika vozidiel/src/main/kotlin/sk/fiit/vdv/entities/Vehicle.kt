package sk.fiit.vdv.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant
import java.util.*


@Entity
@Table(name = "vehicles")
open class Vehicle {
    @Id
    @Column(name = "id", nullable = false)
    open var id: UUID? = null

    @Column(name = "vin", length = Integer.MAX_VALUE)
    open var vin: String? = null

    @Column(name = "license_plate", length = Integer.MAX_VALUE)
    open var licensePlate: String? = null

    @Column(name = "brand", length = Integer.MAX_VALUE)
    open var brand: String? = null

    @Column(name = "model", length = Integer.MAX_VALUE)
    open var model: String? = null

    @Column(name = "manufactured_at", length = Integer.MAX_VALUE)
    open var manufacturedAt: String? = null

    @Column(name = "num_of_seats", length = Integer.MAX_VALUE)
    open var numOfSeats: String? = null

    @Column(name = "color", length = Integer.MAX_VALUE)
    open var color: String? = null

    @Column(name = "created_at")
    open var createdAt: Instant? = null

    @Column(name = "modified_at")
    open var modifiedAt: Instant? = null
}