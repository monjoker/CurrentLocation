package pnam.currentlocation.model.usecase.live

import kotlinx.coroutines.flow.Flow
import pnam.currentlocation.model.database.domain.Location
import pnam.currentlocation.model.repository.location.LocationRepository
import javax.inject.Singleton

@Singleton
interface LiveLocationUseCase {
    val locationRepository: LocationRepository
    fun getLiveLocation(): Flow<Location>
}