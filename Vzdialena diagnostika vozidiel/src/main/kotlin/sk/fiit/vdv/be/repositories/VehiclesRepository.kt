package sk.fiit.vdv.be.repositories

import org.springframework.data.jpa.repository.JpaRepository
import sk.fiit.vdv.be.entities.Vehicle
import java.util.UUID

interface VehiclesRepository: JpaRepository<Vehicle, UUID> {
    fun getVehicleByBrand(brand: String): List<Vehicle>
}