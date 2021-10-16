package nesty.anzhy.matkonim.data.repository

import dagger.hilt.android.scopes.ActivityRetainedScoped
import nesty.anzhy.matkonim.data.database.LocalDataSource
import nesty.anzhy.matkonim.data.network.RemoteDataSource
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource,
    localDataSource: LocalDataSource,
) {
    val remote = remoteDataSource
    val local = localDataSource
}